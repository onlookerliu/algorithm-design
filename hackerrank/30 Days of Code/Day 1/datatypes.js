process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

// Reads complete line from STDIN
function readLine() {
    return input_stdin_array[input_currentline++];
}

function main() {
    var i = 4
    var d = 4.0
    var s = "HackerRank "

    var i2, d2, s2
    i2 = parseInt(readLine())
    d2 = parseFloat(readLine())
    s2 = readLine()
    
    process.stdout.write(i + i2 + "\n")
    process.stdout.write((d + d2).toFixed(1) + "\n")
    process.stdout.write(s + s2 + "\n")
}