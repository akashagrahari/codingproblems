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
	x = arr[i]
	hole = i
	while hole>0 && arr[hole-1]>x
		arr[hole] = arr[hole-1]
		hole = hole-1
	end
	arr[hole]=x
end

puts arr
