
def swap(arr, i, j):
  temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
  return arr

def sort_array(arr, i):
  pivot = arr[i]
  smaller, equal, larger = 0, 0, len(arr) - 1
  #print smaller, equal, larger
  while equal <= larger:
    if arr[equal] < pivot:
      arr = swap(arr, smaller, equal)
      smaller += 1
      equal += 1
    elif arr[equal] == pivot:
      equal += 1
    else: # arr[equal] > pivot
      arr = swap(arr, equal, larger)
      larger -= 1
  return arr

def main():
  temp_array = [12, 32, 59, 92, 3, 12]
  index = 2
  print temp_array
  print "index = " + str(index) + ". Value = " + str(temp_array[index])
  print sort_array(temp_array, index)


if __name__ == "__main__":
    main()
