You are tasked with implementing a text processing system that applies various formatting options to a given text. The formatting options include functionalities such as adding bold, italic, underline, and color to the text. However, the system should be flexible and allow users to combine these formatting options in any order. Additionally, new formatting options may be introduced in the future.

Design a solution using the Decorator design pattern to ensure that the text processing system is extensible, easy to maintain, and allows for dynamic composition of formatting options. The goal is to enable users to create customized and complex text formatting by combining different decorators while keeping the core text processing functionality intact.

Consider the following aspects in your design:

Define a component interface representing the core text processing functionality.
Create concrete components that implement the core text processing functionality.
Design decorators for each formatting option (bold, italic, underline, color).
Allow users to dynamically combine and stack multiple decorators on top of each other.
Ensure that the order of applying decorators does not affect the final result.
Consider future extensibility for adding new formatting options.
Your solution should provide a clear separation of concerns, making it easy to add new formatting options without modifying existing code. Additionally, the implementation should be easily understandable and maintainable by other developers.
