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
	# choose a pivot point. In this case, we choose last element, always!
	pIndex = start
	# pIndex will eventually denote the final position of pivot element
	for i in (start..stop-1)
		if (arr[i]<=pivot)
			temp = arr[i]
			arr[i] = arr[pIndex]
			arr[pIndex] = temp
			# swap i element and pIndex element and increase pIndex position by one
			pIndex = pIndex + 1
		end
	end
	temp = arr[pIndex] 
	arr[pIndex] = arr[stop]
	arr[stop] = temp
	# swap last element with pivot elements so that pivot element assumes place on pIndex
	return pIndex
end

def quickSort(arr, start, stop)
	if (start>=stop)
		# stop when only one element is left
		return
	end
	pIndex = partitionArray(arr, start, stop)
	quickSort(arr, start, pIndex - 1)
	quickSort(arr, pIndex, stop)
end 

quickSort(arr, 0, n-1)
puts arr