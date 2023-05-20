const generateRow = (row) => {
  if (row === 1) {
    return [1];
  }

  const prevRow = generateRow(row - 1);
  const ansRow = [1];

  for (let col = 1; col < row - 1; col++) {
    const ans = prevRow[col - 1] + prevRow[col];
    ansRow.push(ans);
  }

  ansRow.push(1);
  return ansRow;
};

function printPascalTriangle(rows) {
  for (let i = 1; i <= rows; i++) {
    const row = generateRow(i);
    console.log(' '.repeat(rows - i), row.join(' '));
  }
}

printPascalTriangle(14);
