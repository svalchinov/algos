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

const sorted = quicksort([6, 4, 9, 3, 1, 10, 7, 5, 2, 8, 3]);
console.log("Sorted " + sorted);
