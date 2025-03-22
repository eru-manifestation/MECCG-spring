module.exports = {
  testEnvironment: "jsdom",
  transform: {
    "^.+\\.(js|jsx|ts|tsx)$": "babel-jest"
  },
  setupFilesAfterEnv: ["@testing-library/jest-dom"],
  moduleNameMapper: {
    "\\.(css|less|scss|sass)$": "identity-obj-proxy", // Mock CSS imports
    "\\.(svg|png|jpg|jpeg|gif|webp|avif|ico|bmp|tiff)$": "<rootDir>/__mocks__/fileMock.js" // Mock static assets
  }
};
