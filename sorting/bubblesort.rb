# ascending sort
puts "Enter size of set"
n = gets.to_i
puts "enter numbers"
arr = Array.new(n)

for i in (0..n-1)
	arr[i] = gets.to_i
end
puts "\n"

# Compparing consecutive elements and doing multiple passes of them

for i in (0..n-2)
	# Avoid index out of bounds
	isSorted = true
	for j in (0..n-2-i)
		# every consecutive loop puts on correct element at the end. So reduce max limit by that amount
		if arr[j]>arr[j+1]
			temp = arr[j]
			arr[j] = arr[j+1]
			arr[j+1] = temp
			isSorted = false
		end
	end
	if isSorted
		# if no swap occurs in a pass, sorting is done
		break
	end
end

puts arr
