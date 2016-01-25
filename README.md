#Ruby Quick Hands On in 30 mins 
##In Essense, this is the note I took after finishing the codeacademy Ruby introductory course.
Credit to Codeacademy.com.

This guide is for intermediate programmers who had previous programming experience in Object-Oriented programming who want a taste of Ruby, yet do not have 13 hours to spare on Codeacademy.

Don't get me wrong. Codeacademy is a great place to learn new language, I used it all the time, however we often find wasting too much time on entry level stuff such as boolean values.  This will let you take a shortcut and go straight away into understanding Ruby syntax.

```ruby
#Ruby is very much like python. 
https://www.codecademy.com/articles/glossary-ruby

puts "….."   #print string and attach a newline after it
print "….."  #print

#Everything is object and everything has methods.

gets  #getting input . Ruby automatically adds blank line
gets.chomp #remove the extra line

variable.capitalize!   
#the ! Is such that next time you use #{variable} it is automatically variable.capitalize. 

if ...
	...
elsif ...
	...
else 
	...
end
=begin
Whereas in python, it is 
if … : 
	…
=end


unless ... 
	...
else
	...
end 
# this is opposite to if/else


=   #the assignment operator
== !=  #the comparator
&&  ||  !  #boolean operators

variable.include? "substring"  #boolean -> if the variable includes the substring



print "hi"
user_input = gets.chomp
user_input.downcase!

if user_input.include? "s"
    print user_input.gsub!(/s/, "th")
end



#while loop
i = 3
while i > 0 do
  print i
  i -= 1
end


#for loop
for num in 1...10
  puts num
end
# ... 3 dots exclude the 10, .. 2 dots include 10

#loop
loop { print "Hello, world!" }   # indefinite loop

i = 20
loop do  #do not forget do
  i -= 1
  next if i % 2 == 1 #skips odd
  print "#{i}"
  break if i <= 0
end


#until loop
i = 3
while i > 0 do
  print i
  i -= 1
end

j = 3
until j == 0 do
  print j
  j -= 1
end
#these are the same


#array
array = [1,3,4]


#each
object.each { |item| # Do something }

object.each do |item| 
# Do something 
end


#times
10.times { print "hllo" }  #print .. 10 times


#print multiple arrays
multi_d_array = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]

multi_d_array.each { |x| puts "#{x}\n" }


#hashs
=begin
Hashes are sort of like JavaScript objects or Python 
dictionaries.a hash is a collection of key-value pairs. 
=end
my_hash = { 
  "name" => "Eric",
  "age" => 26,
  "hungry?" => true
}

puts my_hash["name"]
puts my_hash["age"]
puts my_hash["hungry?"]
#can also be created using Hash.new, eg:
pets = Hash.new


variable.split #takes a string and returns an array
text.split(",") #split using , as delimits
variable.each do  |x,y| 
	...
end    #iterator thro 2d array.


#histogram sample
puts "Text please: "
text = gets.chomp

words = text.split(" ")
frequencies = Hash.new(0)  #default value for hash
words.each { |word| frequencies[word] += 1 }
frequencies = frequencies.sort_by {|a, b| b }
frequencies.reverse!
frequencies.each { |word, frequency| puts word + " " + frequency.to_s }

#sort by field of hash
colors = {"blue" => 3, "green" => 1, "red" => 2}
colors = colors.sort_by do |color, count|
  count
end
colors.reverse!


#int to string 
int.to_s



#methods
def method_name
  # Do something!
end

#function call -> similar to scheme

#splat! -> see eg. unsure of how many arguments there is
def what_up(greeting, *bros)
  bros.each { |bro| puts "#{greeting}, #{bro}!" }
end
 
what_up("What up", "Justin", "Ben", "Kevin Sorbo")

#blocks are like nameless methods, see examples
#Block syntax uses either do..end or curly braces ({})
1.times do
  puts "I'm a code block!"
end

1.times { puts "As am I!" }



# method that capitalizes a word
def capitalize(string) 
  puts "#{string[0].upcase}#{string[1..-1]}"
end

capitalize("ryan") # prints "Ryan"
capitalize("jane") # prints "Jane"

# block that capitalizes each string in the array
["ryan", "jane"].each {|string| puts "#{string[0].upcase}#{string[1..-1]}"} # prints "Ryan", then "Jane"

book_1 <=> book_2  #combined comparison operator

#2 ways to sort book in descending order
books.sort! do |first, second|
    second <=> first
end 

books.sort do |first, second| 
    if first < second # first book before second alphabetically
       -1
    elsif first > second # first after second
       1
    else # first and second are the same
       0
    end
end

=begin
Symbols make good hash keys for a few reasons: 
They're immutable, meaning they can't be changed once they're created; 
Only one copy of any symbol exists at a given time, so they save memory; 
Symbol-as-keys are faster than strings-as-keys because of the above two reasons.
=end


#these are the same for converting str to symbol
s.intern 
s.to_sym

#symbols iterator is faster than string 
require 'benchmark'

string_AZ = Hash[("a".."z").to_a.zip((1..26).to_a)]
symbol_AZ = Hash[(:a..:z).to_a.zip((1..26).to_a)]

string_time = Benchmark.realtime do
  100_000.times { string_AZ["r"] }
end

symbol_time = Benchmark.realtime do
  100_000.times { symbol_AZ[:r] }
end

puts "String time: #{string_time} seconds."
puts "Symbol time: #{symbol_time} seconds."

# ^ this outputs :
#  String time: 0.027082974 seconds.
#  Symbol time: 0.009799357 seconds.


#.select 

my_hash = { one: 1, two: 2, three: 3 }

my_hash.each_key { |k| print k, " " }
# ==> one two three

my_hash.each_value { |v| print v, " " }
# ==> 1 2 3

#another syntax for if conditionals
# => expression if boolean
puts "It's true!" if true

boolean ? Do this if true: Do this if false
#remember the space btw boolean and ?


#just like switch, ruby has case
case language
when "JS"
  puts "Websites!"
when "Python"
  puts "Science!"
when "Ruby"
  puts "Web apps!"
else
  puts "I don't know!"
end

#to simplify
case language
  when "JS" then puts "Websites!"
  when "Python" then puts "Science!"
  when "Ruby" then puts "Web apps!"
  else puts "I don't know!"
end


#conditional assignment operator
# => used when we want to assign a variable only if it is not assigned

#implicit
#Ruby's return methods returns the  last evaluated result. 


#call and response
[1, 2, 3].respond_to?(:to_sym)
#return false as array does not turn to symbol


#concaternation operator << 
[1, 2, 3] << 4
# ==> [1, 2, 3, 4]

#works on strings 
"Yukihiro " << "Matsumoto"
# ==> "Yukihiro Matsumoto"


#string interpolation 
puts "I love " << thing << "!"
#rewrite as 
puts "I love #{thing}!"

#use of tenery operator
puts 1 < 2 ? "One is less than two!" : "One is not less than two."
#note that puts are in front 




#modify codes
$VERBOSE = nil    # allow use of Prime.new in ruby 1.8
require 'prime'   # This is a module. We'll cover these soon!

def first_n_primes(n)

 "n must be an integer." unless n.is_a? Integer
 "n must be greater than 0." if n <= 0
 #changed conditional to 1 liner
  
  prime_array ||= []   #modified to ||=
  
  prime = Prime.new
  n.times { prime_array << prime.next }  
  #modified .push to <<  and n.times instead of for loop
  prime_array
  #removed extra return
end

first_n_primes(10)


#with ruby 1.9 onwards
require 'prime'

def first_n_primes(n)
  # Check for correct input!
  "n must be an integer" unless n.is_a? Integer
  "n must be greater than 0" if n <= 0

  # The Ruby 1.9 Prime class makes the array automatically!
  prime = Prime.instance
  prime.first n
end

first_n_primes(10)


#collect
#  The collect method takes a block and applies the 
#  expression in the block to every element in an array. 
my_num.collect
#do not mutate my_num array, 
#   if intended use my_num.collect!
#(The .collect! and .map! methods do the exact same thing.)


#yielding
def block_test
  puts "We're in the method!"
  puts "Yielding to the block..."
  yield
  puts "We're back in the method!"
end

block_test { puts ">>> We're in the block!" }

#output:
=begin
We're in the method!
Yielding to the block...
>>> We're in the block!
We're back in the method!
=end


 #syntax
 def method_name(parameter)
  yield parameter
end

method_name(argument) { block }



#Don't Repeat Yourself
#by using proc keyword
multiples_of_3 = Proc.new do |n|
  n % 3 == 0
end

(1..100).to_a.select(&multiples_of_3)


#another eg
cube = Proc.new { |x| x ** 3 }
[1, 2, 3].map(&cube)
#note: no space btw map and (&...)

#lambda 
def lambda_demo(a_lambda)
  puts "I'm the method!"
  a_lambda.call
end

lambda_demo(lambda { puts "I'm the lambda!" })
#output:
=begin
I'm the method!
I'm the lambda!
=end


#lambda syntax
lambda { |param| block }


#differnece proc vs lambda
def batman_ironman_proc
  victor = Proc.new { return "Batman will win!" }
  victor.call
  "Iron Man will win!"
end

puts batman_ironman_proc

def batman_ironman_lambda
  victor = lambda { return "Batman will win!" }
  victor.call
  "Iron Man will win!"
end

puts batman_ironman_lambda

#output
=begin
Batman will win!
Iron Man will win!
=end

=begin
First, a lambda checks the number of arguments passed to it, 
while a proc does not. This means that a lambda will throw 
an error if you pass it the wrong number of arguments, whereas 
a proc will ignore unexpected arguments and assign nil to any 
that are missing.
Second, when a lambda returns, it passes control back to the 
calling method; when a proc returns, it does so immediately, 
without going back to the calling method.
=end



#OOP 
class Language
  def initialize(name, creator)
    @name = name
    @creator = creator
  end
	
  def description
    puts "I'm #{@name} and I was created by #{@creator}!"
  end
end

ruby = Language.new("Ruby", "Yukihiro Matsumoto")
python = Language.new("Python", "Guido van Rossum")
javascript = Language.new("JavaScript", "Brendan Eich")

ruby.description
python.description
javascript.description
#By convention, class names start with a capital letter and use CamelCase



#scope eg
class Computer
  $manufacturer = "Mango Computer, Inc."
  @@files = {hello: "Hello, world!"}
  
  def initialize(username, password)
    @username = username
    @password = password
  end
  
  def current_user
    @username
  end
  
  def self.display_files
    @@files
  end
end

# Make a new Computer instance:
hal = Computer.new("Dave", 12345)

puts "Current user: #{hal.current_user}"
# @username belongs to the hal instance.

puts "Manufacturer: #{$manufacturer}"
# $manufacturer is global! We can get it directly.

puts "Files: #{Computer.display_files}"
# @@files belongs to the Computer class.

#output 
=begin
Current user: Dave
Manufacturer: Mango Computer, Inc.
Files: {:hello=>"Hello, world!"}	
=end


#super class && derived class
class DerivedClass < Base
  def some_method
    super(optional args)
      # Some stuff
    end
  end
end





#Computer eg.
class Machine
  @@users = {}
  
  def initialize(username, password)
    @username = username
    @password = password
    @@users[username] = password
    @files = {}
  end
  
  #instance methods
  def create(filename)
    time = Time.now
    @files[filename] = time
    puts "#{filename} was created by #{@username} at #{time}."
  end

  #class methods  
  def Machine.get_users
  	#becase @@users is class variable, we need to use 
  	#   class methods to grab it def variable.method
    @@users
  end
end

my_machine = Machine.new("eric", 01234)
your_machine = Machine.new("you", 56789)

my_machine.create("groceries.txt")
your_machine.create("todo.txt")

puts "Users: #{Machine.get_users}"





#attr_accessor
class Person
	# so that you don't need a method to access
  attr_reader :name
  attr_reader :job
  attr_writer :job
  #better yet, change it to attr_accessor for both
  #   readable and writable
  attr_accessor :job
  
  def initialize(name, job)
    @name = name
    @job = job
  end
end

#ruby convention 
def job=(new_job)
	@job = new_job
end
#job= convention for methods that sets value


#module is like a toolbox
module ModuleName
  # Bits 'n pieces
end

#scope resolution operator
#namespacing for diff modules so ruby don't get confused
#just like java and c++:   :: 
require 'module'

#in class 
class ... 
	include module
end
#same as require, just doesn't need scope resolution operator anymore




#Here is an example of Extend 
# ThePresent has a .now method that we'll extend to TheHereAnd
module ThePresent
  def now
    puts "It's #{Time.new.hour > 12 ? Time.new.hour - 12 : Time.new.hour}:#{Time.new.min} #{Time.new.hour > 12 ? 'PM' : 'AM'} (GMT)."
  end
end

class TheHereAnd
  extend ThePresent
end

TheHereAnd.now


#Example Bank 
class Account
  attr_reader :name, :balance
  def initialize(name, balance=100)
    @name = name
    @balance = balance
  end
  
  def display_balance(pin_number)
    puts pin_number == pin ? "Balance: $#{@balance}." : pin_error
  end
  
  def withdraw(pin_number, amount)
    if pin_number == pin
      @balance -= amount
      puts "Withdrew #{amount}. New balance: $#{@balance}."
    else
      puts pin_error
    end
  end
  
  private
  
  def pin
    @pin = 1234
  end
  
  def pin_error
    "Access denied: incorrect PIN."
  end
end

my_account = Account.new("Eric", 1_000_000)
my_account.withdraw(11, 500_000)
my_account.display_balance(1234)
my_account.withdraw(1234, 500_000)
my_account.display_balance(1234)

```

My apologizes if some of the codes are unclear to you as this mainly serves as a personal note. Feel free to add on so that it can benefit other people. 
