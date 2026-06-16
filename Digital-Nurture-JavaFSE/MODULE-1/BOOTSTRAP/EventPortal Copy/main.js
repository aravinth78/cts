var events = [
    {title:"Summer Vibes", date:"2026-07-10", loc:"Riverside Park", cat:"music", fee:25, img:"assets/images/event1.png", desc:"Music fest with live bands."},
    {title:"Night Lights", date:"2026-08-15", loc:"Harbor Arena", cat:"music", fee:40, img:"assets/images/event2.png", desc:"Concert under stars."},
    {title:"Flavors Fest", date:"2026-06-20", loc:"Market Square", cat:"food", fee:10, img:"assets/images/event3.png", desc:"Food from local vendors."},
    {title:"Art Walk", date:"2026-09-12", loc:"Downtown", cat:"art", fee:15, img:"assets/images/event4.png", desc:"Tour of local art."},
    {title:"City Run", date:"2026-10-18", loc:"Main Streets", cat:"sports", fee:30, img:"assets/images/event5.png", desc:"10K run through city."},
    {title:"Innovation Lab", date:"2026-11-22", loc:"Tech Hub", cat:"tech", fee:50, img:"assets/images/event6.png", desc:"Workshop with mentors."}
];

var regCount = {music:0, sports:0, tech:0, food:0, art:0};

function showEvents(list) {
    var el = document.getElementById("eventList");
    el.innerHTML = "";
    for (var i = 0; i < list.length; i++) {
        var e = list[i];
        var d = document.createElement("div");
        d.style.cssText = "border:1px solid #ddd;padding:15px;margin:10px 0;border-radius:5px;";
        d.innerHTML = "<img src='" + e.img + "' width='200' style='float:left;margin-right:15px;'>" +
            "<h3>" + e.title + "</h3>" +
            "<p>" + e.desc + "</p>" +
            "<p><strong>" + e.date + "</strong> | " + e.loc + " | $" + e.fee + "</p>" +
            "<p>Category: " + e.cat + "</p>" +
            "<button onclick='alert(\"Viewing: " + e.title + "\")'>View</button>";
        el.appendChild(d);
    }
}

function doFilter() {
    var val = document.getElementById("catFilter").value;
    if (val == "all") {
        showEvents(events);
    } else {
        var filtered = [];
        for (var i = 0; i < events.length; i++) {
            if (events[i].cat == val) {
                filtered.push(events[i]);
            }
        }
        showEvents(filtered);
    }
}

function showFee() {
    var sel = document.getElementById("eventType");
    var fees = {music:25, sports:15, tech:50, free:0};
    document.getElementById("feeShow").innerHTML = "$" + fees[sel.value];
}

function checkPhone(inp) {
    var p = inp.value;
    var err = document.getElementById("phoneErr");
    if (p.length > 0 && !/^\d{3}-\d{3}-\d{4}$/.test(p)) {
        err.style.display = "block";
    } else {
        err.style.display = "none";
    }
}

function countChars(t) {
    document.getElementById("charCount").innerHTML = t.value.length;
}

function enlarge(img) {
    document.getElementById("bigImg").src = img.src;
    document.getElementById("modal").style.display = "block";
}

function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(function(pos) {
            document.getElementById("loc").innerHTML = "Lat: " + pos.coords.latitude.toFixed(2) + ", Lng: " + pos.coords.longitude.toFixed(2);
        });
    } else {
        document.getElementById("loc").innerHTML = "Not supported";
    }
}

document.getElementById("regForm").onsubmit = function(e) {
    e.preventDefault();
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var date = document.getElementById("date").value;
    var type = document.getElementById("eventType").value;
    if (!name || !email || !date) {
        alert("Please fill required fields");
        return;
    }
    if (regCount[type] >= 50) {
        alert("Sold out!");
        return;
    }
    regCount[type]++;
    document.getElementById("regMsg").style.display = "block";
    document.getElementById("regMsg").innerHTML = "Thanks " + name + "! Registered for " + type + " on " + date + ". Confirmation sent to " + email + ".";
    document.getElementById("regForm").reset();
    document.getElementById("feeShow").innerHTML = "$25";
    document.getElementById("charCount").innerHTML = "0";
};

showEvents(events);