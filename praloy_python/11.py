# 11. Search for palindrome and unique words in a text using class method and string method.

# Name: Praloy Sahoo
# Roll No: 0020501095


class TextAnalyzer:

    # class method to find palindrome and unique words
    def analyze(self, text):

        words = text.lower().split()

        unique_words = set(words)
        palindromes = []

        # check palindrome words
        for word in unique_words:
            if word == word[::-1] and len(word) > 1:
                palindromes.append(word)

        return unique_words, palindromes


# take input text
text = input("Enter a sentence: ")

obj = TextAnalyzer()

unique, palindrome = obj.analyze(text)

print("\nUnique words:")
print(unique)

print("\nPalindrome words:")
print(palindrome)