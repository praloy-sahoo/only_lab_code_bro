#include <bits/stdc++.h>
using namespace std;

/* ============ NODE STRUCTURE ============ */
struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = NULL;
        right = NULL;
    }
};

/* ============ FUNCTION TO PRINT PATHS ============ */
void printPaths(Node* root, vector<int>& path) {
    if (root == NULL)
        return;

    // add current node to path
    path.push_back(root->data);

    // if leaf node, print path
    if (root->left == NULL && root->right == NULL) {
        for (int x : path) {
            cout << x << " ";
        }
        cout << endl;
    } 
    else {
        // recurse left and right
        printPaths(root->left, path);
        printPaths(root->right, path);
    }

    // backtrack
    path.pop_back();
}

/* ============ MAIN FUNCTION ============ */
int main() {

    /*
            1
           / \
          2   3
           \
            5
    */

    Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->right = new Node(5);

    vector<int> path;

    cout << "Root to Leaf Paths:\n";
    printPaths(root, path);

    return 0;
}
