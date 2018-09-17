# ascending sort
puts "Enter size of set"
n = gets.to_i
puts "enter numbers"
arr = Array.new(n)

for i in (0..n-1)
	arr[i] = gets.to_i
end
puts "\n"

# find minimum element in each pass at place it at the leftmost point in unsorted array

for i in (0..n-1)
	min = i
	for j in (i+1..n-1)
		 if arr[j]<arr[min]
		 	min = j
		 end
	end
	temp = arr[i]
	arr[i] = arr[min]
	arr[min] = temp
end

puts arr
