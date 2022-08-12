my_string = "inteerrrvieew"

# Set approach
characters_already_encountered = set()
duplicate_characters = set()
for character in my_string:
    if character in characters_already_encountered:
        duplicate_characters.add(character)
    else:
        characters_already_encountered.add(character)

print(duplicate_characters)

# Dictionary approach
character_frequency = {}
for character in my_string:
    if character in character_frequency:
        character_frequency[character] = character_frequency[character] + 1
    else:
        character_frequency[character] = 1

duplicate_characters_2 = []
for key in character_frequency:
    if character_frequency[key] > 1:
        duplicate_characters_2.append(key)

print(duplicate_characters_2)


