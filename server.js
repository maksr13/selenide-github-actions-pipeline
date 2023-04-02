const http = require('http');
const fs = require('fs');
const path = require('path');

const port = 3000; // choose a port number

const server = http.createServer((req, res) => {
  // parse the requested file path
  let filePath = '.' + req.url;
  if (filePath == './') {
    filePath = './index.js'; // serve index.js by default
  }
  filePath = path.join(__dirname, filePath);

  // read the requested file from disk
  fs.readFile(filePath, (err, data) => {
    if (err) {
      res.writeHead(404, {'Content-Type': 'text/plain'});
      res.end('404 Not Found');
    } else {
      res.writeHead(200, {'Content-Type': 'text/html'});
      res.end(data);
    }
  });
});

server.listen(port, () => {
  console.log(`Server running at http://localhost:${port}/`);
});