console.log("Submitting form");
const data = { name: "Jane" };
console.log("Data:", data);
debugger; // Inspect variables
fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify(data),
    headers: { "Content-type": "application/json" }
}).then(res => res.json()).then(console.log);