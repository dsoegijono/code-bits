class Equilibrium {
  public int solution(int[] A) {
    if (A.length == 0) return -1;
    long sum = getSum(A);
    int ret = 0;
    long lSum = 0;
    for (int i = 0; i < A.length; i++) {
      long rSum = sum - A[i] - lSum;
      if (rSum == lSum) {
        return i;
      }
      lSum += A[i];
    }
    return -1;
  }

  long getSum(int[] A) {
    long ret = 0;
    for (int i=0; i < A.length; i++) {
      ret += (long)A[i];
    }
    return ret;
  }
}
