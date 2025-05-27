const events = [
    { name: "Music Fest", date: "2025-07-01", seats: 10 },
    { name: "Art Show", date: "2023-01-01", seats: 0 }
];
events.forEach(e => {
    if (new Date(e.date) > new Date() && e.seats > 0) {
        console.log(`${e.name} is available`);
    }
});
try {
    let registered = true;
    if (!registered) throw "Registration failed";
    console.log("Registered successfully");
} catch (err) {
    console.error(err);
}