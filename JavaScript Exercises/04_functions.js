function addEvent(name) { console.log("Event added:", name); }
function registerUser(name) { console.log("User registered:", name); }
function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
}
function registrationCounter() {
    let count = 0;
    return function() {
        count++;
        return count;
    };
}
const countReg = registrationCounter();
console.log(countReg());