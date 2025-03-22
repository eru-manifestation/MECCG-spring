const socket = new WebSocket("ws://localhost:8080/game");

socket.onopen = () => {
  console.log("Connected to WebSocket server");
};

socket.onmessage = (event) => {
  try {
    const message = JSON.parse(event.data); // Parse JSON if the server sends JSON
    console.log("Message received:", message);

    // Example: Handle specific message types
    if (message.type === "gameUpdate") {
      console.log("Game update:", message.payload);
    } else if (message.type === "chatMessage") {
      console.log("Chat message:", message.payload);
    }
  } catch (error) {
    console.error("Error parsing message:", event.data);
  }
};

export default socket;
