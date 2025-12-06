/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    static int arr[200];
    *returnSize=0;
    void dfs(struct TreeNode* node) {
        if(node==NULL) return;
        arr[(*returnSize)++]=node->val;
        dfs(node->left);
        dfs(node->right);
    }
    dfs(root);
    return arr;
}