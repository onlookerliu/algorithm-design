function processData(inputString) {
    // This line of code prints the first line of output
    // console.log("Hello, World.");
    process.stdout.write("Hello, World.\n");

    // Write the second line of output that prints the contents of 'inputString' here.
    // console.log(inputString);
    process.stdout.write(inputString);
}


process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
    processData(_input);
});