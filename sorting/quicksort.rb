# ascending sort
puts "Enter size of set"
n = gets.to_i
puts "enter numbers"
arr = Array.new(n)

for i in (0..n-1)
	arr[i] = gets.to_i
end
puts "\n"

def partitionArray(arr, start, stop)
	pivot = arr[stop]
	pIndex = start
	for i in (start..stop-1)
		if (arr[i]<=pivot)
			temp = arr[i]
			arr[i] = arr[pIndex]
			arr[pIndex] = temp
			pIndex = pIndex + 1
		end
	end
	temp = arr[pIndex] 
	arr[pIndex] = arr[stop]
	arr[stop] = temp
	return pIndex
end

def quickSort(arr, start, stop)
	if (start>=stop)
		return
	end
	pIndex = partitionArray(arr, start, stop)
	quickSort(arr, start, pIndex - 1)
	quickSort(arr, pIndex, stop)
end 

quickSort(arr, 0, n-1)
puts arr