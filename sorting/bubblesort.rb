# ascending sort
puts "Enter size of set"
n = gets.to_i
puts "enter numbers"
arr = Array.new(n)

for i in (0..n-1)
	arr[i] = gets.to_i
end
puts "\n"


for i in (0..n-2)
	isSorted = true
	for j in (0..n-2-i)
		if arr[j]>arr[j+1]
			temp = arr[j]
			arr[j] = arr[j+1]
			arr[j+1] = temp
			isSorted = false
		end
	end
	if isSorted
		break
	end
end

puts arr
