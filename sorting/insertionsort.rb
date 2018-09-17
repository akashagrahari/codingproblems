# ascending sort
puts "Enter size of set"
n = gets.to_i
puts "enter numbers"
arr = Array.new(n)

for i in (0..n-1)
	arr[i] = gets.to_i
end
puts "\n"


for i in (1..n-1)
	# one element is always sorted. in this case we start from index 0
	x = arr[i] # We will pick out index i element and hope to put it in place, in the sorted array on the left
	hole = i # In this case the hole is at i
	while hole>0 && arr[hole-1]>x
		# as long as hole - 1 element is lower than current number shift it to right and shift hole to left
		arr[hole] = arr[hole-1]
		hole = hole-1
	end
	arr[hole]=x
	# place the number in correct place - the updated hole position
end

puts arr
