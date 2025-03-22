const socket = new WebSocket("ws://localhost:8080/game");

socket.onopen = () => {
  console.log("Connected to WebSocket server");
};

socket.onmessage = (event) => {
  console.log("Message received:", event.data);
};

export default socket;
