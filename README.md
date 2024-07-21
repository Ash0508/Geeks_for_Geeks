# GfG to GitHub Chrome Extension

This Chrome Extension swiftly uploads your GeeksForGeeks problem solutions to a designated GitHub repository right after successful submission.

## Why Use GfG to GitHub?

In today's world, GitHub serves as a vital portfolio for developers. This extension helps you centralize all your GeeksForGeeks solutions on GitHub in an organized way.

Manually transferring your GeeksForGeeks solutions to a GitHub repository is tedious and time-consuming. This extension automates the entire process, saving you time and effort.

Centralizing your solutions ensures quick and easy access to all your work.

Having all your solutions in one place helps you track your progress effectively.

## Features

- **Repository Setup:** Easily create a new repository or link an existing one by entering the repository name during the onboarding process.
- **Dashboard:** The extension popup includes a dashboard displaying the number of problems solved, categorized by difficulty level.
- **Organized Directory:** Each solution is stored in a directory named after the problem's difficulty level, keeping your repository well-organized.
- **README Files:** A README.md file is generated for each new problem, containing all the problem details from GeeksForGeeks.
- **Multi-language Support:** Solutions in different languages are stored separately under the same problem directory.
- **Dark Mode:** The popup window features a toggle for Dark Mode.
- **Interactive Background:** The homepage includes a dynamic background using Particle.js.

## Documentation

### Flow

#### i. Onboarding

1. Install the extension from the Chrome Web Store.
2. Open the extension popup by clicking the 'Extensions' icon in the top-right corner of the browser.
3. Click the 'Authenticate' button, which will redirect you to the GitHub OAuth authentication page.
4. After authenticating your GitHub account, you will be redirected to the extension homepage.
5. Choose to create a new repository or link an existing one. Enter the repository name in the provided field.
   - To create a new repository, enter the desired name and click 'Submit'.
   - To link an existing repository, enter the exact name. If correct, the repository will be linked successfully.
6. Once the repository is created or linked, the onboarding process is complete.
7. If needed, you can re-link the repository later by clicking the 'Link Repository' button in the popup window.

#### ii. Pushing Solutions to GitHub

1. Navigate to 'practice.geeksforgeeks.org' and begin solving problems.
2. Upon successfully submitting a solution, the extension will automatically push it to the linked GitHub repository.
3. Solutions are organized in directories named by difficulty level.
4. A README.md file is created for each problem, containing problem details as shown on GeeksForGeeks.
5. The dashboard statistics update after each submission, showing the number of problems solved by difficulty.

#### iii. The Home Page

1. Access the homepage by clicking the 'Globe' icon in the popup window.
2. Complete the onboarding process via this page.
3. The homepage displays your GeeksForGeeks statistics.
4. The background features an interactive canvas created with Particle.js.
5. A link to the GitHub repository is available in the bottom-right corner.

#### iv. The Popup Window

1. The header includes the extension name and tagline.
2. The middle section varies by onboarding phase:
   - Initially, it shows a green 'Authenticate' button for GitHub OAuth authentication.
   - After authentication, it displays a green 'Link Repository' button, redirecting to the homepage for repository linking.
   - Once linked, it shows a dashboard with problem-solving statistics.
3. The bottom section has:
   - A Dark Mode toggle.
   - Three icons linking to the repository, the homepage, and the developer's email.

### Local Development Setup

1. Download the repository as a .zip file.
2. Extract the files on your device.
3. Open Chrome's extension tab and enable 'Developer Mode' using the toggle in the top-right corner.
4. Click 'Load Unpacked' and select the extracted folder.
5. The extension is now ready for local development.

# MIT License
