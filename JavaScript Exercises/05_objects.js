function Event(name, seats) {
    this.name = name;
    this.seats = seats;
}
Event.prototype.checkAvailability = function() {
    return this.seats > 0;
};
const e = new Event("Dance Night", 50);
console.log(Object.entries(e));