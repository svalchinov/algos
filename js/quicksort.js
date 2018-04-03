function quicksort(arr) {

    if (arr.length < 1) { return arr; }

    const pivot = arr.pop(), left = [], right = [];

    arr.forEach((item) => {
        if (item <= pivot) {
            left.push(item);
        } else {
            right.push(item);
        }
    });

    return quicksort(left).concat(pivot).concat(quicksort(right));
}

console.log("Sorted " + quicksort([6, 4, 9, 3, 1, 10, 7, 5, 2, 8, 3]));
// Sorted 1,2,3,3,4,5,6,7,8,9,10
