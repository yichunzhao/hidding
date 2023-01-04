# hidding for testing disconnect from a remote repo, and linking it to a new repo.

## Git remote CMD

Show all remote repo

```
git remote -v

remote_repo_name url

origin  https://github.com/yichunzhao/hidding.git (fetch)
origin  https://github.com/yichunzhao/hidding.git (push)
```

Disconnecting from remote repo

```
git remote rm remote_repo_name 

```

Conneting to remote repo. *git remote add remote_repo_name repo_url*

```

git remote add origin https://github.com/yichunzhao/hidding.git
```

Remove a foler from Remote repo
```
git rm -r .idea
```
afterwards, commit and push
