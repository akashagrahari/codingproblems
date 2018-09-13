# ascending sort
puts "Enter size of set"
n = gets.to_i
puts "enter numbers"
arr = Array.new(n)

for i in (0..n-1)
	arr[i] = gets.to_i
end
puts "\n"

def mergeSort (arr)
	length = arr.length
	if(length<2)
		return arr
	end
	mid = length/2
	left = arr[0..mid-1]
	right = arr[mid..length-1]
	mergeSort(left)
	mergeSort(right)
	merge(left, right, arr)
end

def merge(left, right, arr)
	i=0
	j=0
	k=0
	while(i < left.length and j < right.length)
		if left[i] <= right[j]
			arr[k] = left[i]
			i=i+1
		else
			arr[k] = right[j]
			j=j+1
		end
		k=k+1
	end
	while(i<left.length)
		arr[k] = left[i]
		i=i+1
		j=j+1
	end
	while(j<right.length)
		arr[k] = right[j]
		i=i+1
		j=j+1
	end
end

mergeSort(arr)
puts arr