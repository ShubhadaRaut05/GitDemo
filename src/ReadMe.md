git init
-- project level
git config user.name <username>
git config user.email <email>
git config user.name
git config user.email

--globally for entire system
git config -g user.name <username>
git config -g user.email <email>

--branching
git branch
git branch <branchName>
git checkout <branchName>
git merge <branchName>

master -> fB
git checkout -b branchName || create the branch and move to the new branch




We can connect our local git repo to multiple remote repos
In general its only 1 remote repo per local repo

"name of remote repo[key]" -> "link"

key -> origin


--git remote
git remote add origin <link>
git remote add <key> <link>
git push origin <branchName>

git fetch -> download
git pull -> download, update your code [ merge the remote changes into local]

Downloading the git repo -> very first time -> git clone <link>


Task

0. fork
1. git clone -> forked Repo
2. Create a new feature branch
3. Add a new comparator -> maxSpeed
4. push the new branch
5. Create a PR

Lets imagine -> remote: origin, branch: master
git push origin master

Default upstream -> git push -u origin master
default -> remote: origin, branch: master
git push [internally, git push origin master ]