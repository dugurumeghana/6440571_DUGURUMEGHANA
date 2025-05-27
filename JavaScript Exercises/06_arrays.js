let events = [];
events.push({ name: "Yoga", category: "Health" });
const musicEvents = events.filter(e => e.category === "Music");
const cards = events.map(e => `Join us for ${e.name}`);
console.log(cards);