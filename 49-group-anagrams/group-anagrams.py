class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagrams=defaultdict(list)
        for i in strs:
            key=''.join(sorted(i))
            anagrams[key].append(i)
        return list(anagrams.values())