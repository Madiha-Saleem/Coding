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
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    static int arr[100];
    static int idx=0;
    static int depth = 0;
    depth++;
    if(depth==1)
        idx=0;
    if(root!=NULL){
        inorderTraversal(root->left,returnSize);
        arr[idx++]=root->val;
        inorderTraversal(root->right,returnSize);
    }
    if(depth==1)
        *returnSize=idx;
    depth--;
    return arr;
}