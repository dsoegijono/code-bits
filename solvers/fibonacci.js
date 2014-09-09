function fibonacci(n) {
  var f = 0;
  for (i=0, j=1, k=0; i<=n; i++, f=j+k, k=f);
  return f;
}
