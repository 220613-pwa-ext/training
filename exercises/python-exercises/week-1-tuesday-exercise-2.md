# Week 1 Tuesday Exercise 2

Exercise: Be able to push your code from exercise 1 from today to Github

1. Make sure you have a folder that contains your code from exercise 1 (a folder with app.py file inside it)
2. Initialize your local git repository by typing `git init`
3. Rename the local repository `master` branch to `main` by running `git branch -M main`
4. Go to Github and create a remote repository
5. Copy the "SSH" link for the remote repository that you just created. Make sure it is SSH, NOT HTTPS
    > example: `git@github.com:bach-tran/my-first-python-program.git`
6. Use `git remote add origin <link>` to link the local repository with the remote repository
7. Go through the typical Git workflow
    * `git status` to check what changes should be added to the staging area
    * `git add app.py` to add the app.py file to the staging area
    * `git status` to make sure that the file was indeed added to the staging area and ready to be committed
    * `git commit -m "<commit message>"` to create a commit
        > Make sure your commit messages are in present-tense for the verbs and descriptive about the change being made
        * Instead of "added app.py" it should be "add app.py" for example
    * `git log` to see your commit history
    * `git push origin main` to push the local main branch to the remote main branch
        > The very first time you push, you should use `git push -u origin main`. You don't need -u from that point onwards