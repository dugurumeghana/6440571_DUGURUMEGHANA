fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify({ user: "John" }),
    headers: { "Content-type": "application/json; charset=UTF-8" }
})
.then(res => res.json())
.then(data => {
    console.log("Success", data);
    setTimeout(() => console.log("Delayed success!"), 1000);
})
.catch(err => console.error("Failed", err));