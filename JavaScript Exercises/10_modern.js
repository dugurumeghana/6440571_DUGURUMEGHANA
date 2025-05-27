const events = [{name: "Book Fair", date: "2025-08-01"}];
function logEvent({name, date} = {}) {
    console.log(`Event: ${name} on ${date}`);
}
logEvent(events[0]);
const copy = [...events];