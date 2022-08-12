
# Understand how to use split and join

input = "the dog went with another dog to play with the cat"

words = input.split()

result_list = []
for word in words:
    list_of_characters = list(word) # ex. "the" -> ["t", "h", "e"]
    list_of_characters[0] = list_of_characters[0].upper(); # ex. ["t", "h", "e" ] -> [ "T", "h", "e" ]

    capitalized_word = "".join(list_of_characters) # [ "T", "h", "e" ] -> The
    result_list.append(capitalized_word) # [ "The", "Dog", "Went", "With", "Another", "Dog", "To", "Play", "With", "The" ]

print(" ".join(result_list)) # The Dog Went With Another Dog To Play With The Cat
