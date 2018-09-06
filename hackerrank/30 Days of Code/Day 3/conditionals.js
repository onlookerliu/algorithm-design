'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function main() {
    const N = parseInt(readLine(), 10);
    let statement = "";
    if (N % 2 == 0) {
        if (N <= 5) {
            statement = "Not Weird";
        } else if (N <= 20) {
            statement = "Weird";
        } else {
            statement = "Not Weird";
        }
    } else {
        statement = "Weird";
    }
    process.stdout.write(statement);
}
