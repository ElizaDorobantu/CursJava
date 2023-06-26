package curs12;

public class GitLogFilter {
	
	//Filtering GIT log
	
	//git log |--> show full repo log
	//git log --oneline  |--> trims the log for each commit
	//git log --oneline --all   |--> show all commits from all branches
	//git log --oneline --all --graph  |--> shows all commits, on all branches with graph
	
	// git log -2 (shows last two commits)
	// git log --oneline -4  (shows last 4 commits) |--> filter by number of commits
	
	//git log --after='2023-06-01'
	//git log --before='2023-06-01'  |--> filter by date
	
	//git log --author="Dragos"  |--> filter by author
	
	//git log --author="Dragos" -2  |--> filter last 2 commits by author
	
	//git log --author="Dragos" -2 --stat |--> filter last 2 commits by author and shows modified files
	
	//git log --stat  |--> shows modified files
	
	//git log --grep='comit mesaj' |--> filter by commit message (or part of commit message)
	
	
	

}