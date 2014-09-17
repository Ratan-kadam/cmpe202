var connect = require('connect');
var login = require('./login');

var app = connect();

app.use(connect.json()); // Parse JSON request body into `request.body`
app.use(connect.urlencoded()); // Parse form in request body into `request.body`
app.use(connect.cookieParser()); // Parse cookies in the request headers into `request.cookies`
app.use(connect.query()); // Parse query string into `request.query`

app.use('/', main);

function main(request, response, next) {
	switch (request.method) {
		case 'GET': get(request, response); break;
		case 'POST': post(request, response); break;
		case 'DELETE': del(request, response); break;
		case 'PUT': put(request, response); break;
	}
};

function get(request, response) {
	var cookies = request.cookies;
	console.log(cookies);
	if ('session_id' in cookies) {
		var sid = cookies['session_id'];
		if ( login.isLoggedIn(sid) ) {
			response.setHeader('Set-Cookie', 'session_id=' + sid);
                    response.setHeader('content-type:','text/html');
			response.end(login.hello(sid));	
		} else {
			response.end("Invalid session_id! Please login again\n");
		}
	} else {
		response.end("Please login via HTTP POST\n");
	}
};

function post(request, response) {
	
	var Session_ID = login.login(request.body.name, request.body.email);
        response.setHeader('content-type:','text/html');
	response.setHeader('Set-Cookie', 'session_id=' + Session_ID);
	response.end(login.hello(Session_ID));

};

function del(request, response) {
     
        console.log("DELETE:: Logout from the server");
 	var cookies = request.cookies;
        response.setHeader('content-type:','text/html');
        login.logout(cookies['Session_ID']);
        response.setHeader('content-type:','text/html');

  	response.end('Logged out from the server\n');
};

function put(request, response) {
	console.log("PUT:: Re-generate new seesion_id for the same user");
   

	var reNew_sid = login.login(request.body.name, request.body.email);
        response.setHeader('content-type:','text/html');
        response.setHeader('Set-Cookie: session_id', reNew_sid);
	response.end("Re-freshed session id:");
	
};

app.listen(8000);

console.log("Node.JS server running at 8000...");
