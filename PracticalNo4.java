from collections import deque


class Graph:
    def __init__(self):
        self.graph = {}

    def add_edge(self, node, neighbors):
        self.graph[node] = neighbors

    def bfs(self, start):
        visited = set()
        queue = deque([start])

        while queue:
            current_node = queue.popleft()
            if current_node not in visited:
                print(current_node, end=' ')
                visited.add(current_node)
                queue.extend(neighbor for neighbor in self.graph[current_node] if neighbor not in visited)

    def dfs(self, start, visited=None):
        if visited is None:
            visited = set()

        if start not in visited:
            print(start, end=' ')
            visited.add(start)

            for neighbor in self.graph[start]:
                self.dfs(neighbor, visited)


# Example Usage
if __name__ == "__main__":
    graph = Graph()

    # Example Graph
    graph.add_edge(1, [2, 3])
    graph.add_edge(2, [4, 5])
    graph.add_edge(3, [6])
    graph.add_edge(4, [])
    graph.add_edge(5, [7])
    graph.add_edge(6, [])
    graph.add_edge(7, [])

    print("BFS traversal:")
    graph.bfs(1)

    print("\nDFS traversal:")
    graph.dfs(1)