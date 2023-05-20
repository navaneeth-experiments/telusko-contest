const getPascalTriangleRow = (row) => {
  let ans = 1;
  const generatedRow = [];
  generatedRow.push(1);
  for (let col = 1; col < row; col++) {
    ans = ans * (row - col);
    ans = ans / col;
    generatedRow.push(ans);
  }
  return generatedRow;
};

function printPascalTriangle(rows) {
  for (let i = 1; i <= rows; i++) {
    const row = getPascalTriangleRow(i);
    console.log(' '.repeat(rows - i), row.join(' '));
  }
}

printPascalTriangle(14);
