global.WebSocket = jest.fn(() => ({
  onopen: jest.fn(),
  onmessage: jest.fn(),
  readyState: 0 // WebSocket.CONNECTING
}));

import socket from "./websocket";

describe("WebSocket connection", () => {
  it("should connect to the WebSocket server", () => {
    expect(socket.readyState).toBe(0); // WebSocket.CONNECTING
  });

  it("should handle incoming messages", () => {
    const mockMessage = { data: "Test message" };
    const onMessage = jest.fn();
    socket.onmessage = onMessage;

    socket.onmessage(mockMessage);
    expect(onMessage).toHaveBeenCalledWith(mockMessage);
  });
});
