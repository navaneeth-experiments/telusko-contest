const generateRow = (row) => {
  const cache = {};
  if (row === 1) {
    return [1];
  }

  if (cache[row]) {
    return cache[row];
  }

  const prevRow = generateRow(row - 1, cache);
  const ansRow = [1];

  for (let col = 1; col < row - 1; col++) {
    const ans = prevRow[col - 1] + prevRow[col];
    ansRow.push(ans);
  }

  ansRow.push(1);
  cache[row] = ansRow;
  return ansRow;
};

function printPascalTriangle(rows) {
  for (let i = 1; i <= rows; i++) {
    const row = generateRow(i);
    console.log(' '.repeat(rows - i), row.join(' '));
  }
}

printPascalTriangle(14);
