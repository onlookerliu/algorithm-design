import java.util.Arrays;

public class VampireNumber {

    public static void main(String[] args) {
        String[] ar_str1, ar_str2;
        int sum = 0;
        int from;
        int to;
        int i_val;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            from = Math.max(1000 / i, i + 1);
            to = Math.min(10000 / i, 100);
            for (int j = from; j < to; j++) {
                i_val = i * j;
                if (i_val % 100 == 0 || (i_val - i - j) % 9 != 0) {
                    continue;
                }
                count++;
                ar_str1 = String.valueOf(i_val).split("");
                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                Arrays.sort(ar_str1);
                Arrays.sort(ar_str2);
                if (Arrays.equals(ar_str1, ar_str2)) {
                    sum++;
                    System.out.println("第" + sum +"组: " + i + "*" + j + "=" + i_val);
                }
            }
        }

        System.out.println("共找到" + sum + "组吸血鬼数");
        System.out.println(count);
    }
}

// implement Arrays.equal in JavaScript

// Warn if overriding existing method
// if(Array.prototype.equals)
//     console.warn("Overriding existing Array.prototype.equals. Possible causes: New API defines the method, there's a framework conflict or you've got double inclusions in your code.");
// // attach the .equals method to Array's prototype to call it on any array
// Array.prototype.equals = function (array) {
//     // if the other array is a falsy value, return
//     if (!array)
//         return false;

//     // compare lengths - can save a lot of time 
//     if (this.length != array.length)
//         return false;

//     for (var i = 0, l=this.length; i < l; i++) {
//         // Check if we have nested arrays
//         if (this[i] instanceof Array && array[i] instanceof Array) {
//             // recurse into the nested arrays
//             if (!this[i].equals(array[i]))
//                 return false;       
//         }           
//         else if (this[i] != array[i]) { 
//             // Warning - two different object instances will never be equal: {x:20} != {x:20}
//             return false;   
//         }           
//     }       
//     return true;
// }
// // Hide method from for-in loops
// Object.defineProperty(Array.prototype,"equals",{enumerable:false});