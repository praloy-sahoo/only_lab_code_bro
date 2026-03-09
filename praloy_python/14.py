# 14. Implement a priority queue that stores items by a given priority
# and always returns the item with the highest priority on each pop operation.

# Name: Praloy Sahoo
# Roll No: 0020501095


class PriorityQueue:
    def __init__(self):
        self.data = []   # stores (item, priority)

    def push(self, item, priority):
        self.data.append((item, priority))

    def pop(self):
        if not self.data:
            return None
        
        # assume first element has highest priority
        max_index = 0
        
        # find index of highest priority
        for i in range(1, len(self.data)):
            if self.data[i][1] > self.data[max_index][1]:
                max_index = i
        
        # remove and return item with highest priority
        item = self.data[max_index][0]
        self.data.pop(max_index)
        return item

    def is_empty(self):
        return len(self.data) == 0


pq = PriorityQueue()

pq.push("Task A", 2)
pq.push("Task B", 5)
pq.push("Task C", 1)

print(pq.pop())
print(pq.pop())
print(pq.pop())