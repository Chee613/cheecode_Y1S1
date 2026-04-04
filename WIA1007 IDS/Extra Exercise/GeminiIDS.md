# Data Science & Machine Learning: Comprehensive 100-Question Assessment

## Section 1: Data Science Foundations & Lifecycle

**Q1. In the Data Science Lifecycle, why is "Data Preparation" often cited as the most time-consuming phase?**

- A. It requires the most complex mathematical algorithms.
- B. Real-world data is often incomplete, noisy, and inconsistent.
- C. It is the only phase that requires specialized hardware like GPUs.
- D. Most stakeholders do not understand the importance of cleaning.

**Q2. Which role is primarily focused on the "Model Deployment" and "CI/CD" pipelines for Machine Learning?**

- A. Data Analyst
- B. Data Scientist
- C. ML Engineer
- D. Business Intelligence Developer

**Q3. A "Data-Centric" approach suggests that if a model is underperforming, the team should FIRST:**

- A. Switch to a more complex architecture (e.g., Deep Learning).
- B. Hyperparameter tune the existing model for more epochs.
- C. Audit the data labels for consistency and fix systematic noise.
- D. Collect significantly more data, even if it is of lower quality.

**Q4. Which type of data source provides a "Proprietary Competitive Advantage"?**

- A. Publicly available government census data.
- B. Internal transactional and customer interaction data.
- C. Data scraped from a competitor’s public website.
- D. Open-source datasets from Kaggle.

**Q5. A CSV file is best described as:**

- A. Structured Data
- B. Semi-structured Data
- C. Unstructured Data
- D. Graph-based Data

**Q6. If you are analyzing the "Ranking of top 5 favorite movies," what is the level of measurement?**

- A. Nominal
- B. Ordinal
- C. Interval
- D. Ratio

**Q7. The primary difference between "Interval" and "Ratio" data is:**

- A. Interval data cannot be numeric.
- B. Ratio data has a "true zero" point where the value represents absence.
- C. Interval data cannot be added or subtracted.
- D. There is no difference; they are synonymous.

**Q8. Which of the following is an example of System-Generated data?**

- A. A user filling out a feedback form.
- B. Server logs recording HTTP request durations.
- C. A scientist recording manual observations in a lab.
- D. A government report on inflation rates.

**Q9. In the context of Git, what is the purpose of the git pull command?**

- A. To upload local changes to a remote repository.
- B. To create a new branch for feature development.
- C. To fetch and integrate changes from a remote repository into the local branch.
- D. To delete the local history and start over.

**Q10. When using Google Colab, how do you typically access files stored in your Personal Google Drive?**

- A. By uploading the file to GitHub first.
- B. Using google.colab.drive.mount('/content/drive').
- C. Colab automatically syncs with all Drive files by default.
- D. You must convert the Drive files to JSON first.

## Section 2: Python, Pandas & Preprocessing

**Q11. Which Pandas function is used to combine two DataFrames based on a shared "Key" (e.g., USERID)?**

- A. pd.concat()
- B. df.append()
- C. df.merge()
- D. df.stack()

**Q12. Consider the code: df.isna().sum(). What does this return?**

- A. The total number of rows in the DataFrame.
- B. The count of unique values in every column.
- C. The count of missing (NaN) values for each column.
- D. The percentage of data that is correctly formatted.

**Q13. Why would you use df['Salary'].replace(',', '', regex=True)?**

- A. To remove rows where the Salary is missing.
- B. To remove the currency formatting (commas) so the string can be cast to an integer.
- C. To identify salary outliers using regular expressions.
- D. To split the salary into multiple columns.

**Q14. What is the result of df['State'].nunique()?**

- A. A list of all unique states.
- B. The frequency of the most common state.
- C. The count of unique categories in the 'State' column.
- D. The total number of rows where the state is not null.

**Q15. In Scikit-Learn, which SimpleImputer strategy is best suited for categorical missing data?**

- A. mean
- B. median
- C. most_frequent
- D. constant=0

**Q16. What does "One-Hot Encoding" do?**

- A. It converts numerical values into a 0-1 range.
- B. It converts categorical text labels into multiple binary (0 or 1) columns.
- C. It identifies and removes outliers from the dataset.
- D. It reduces the number of features to prevent overfitting.

**Q17. Which function in Pandas would you use to see the first 10 rows of a dataset?**

- A. df.tail(10)
- B. df.show(10)
- C. df.head(10)
- D. df.print(10)

**Q18. In NumPy, what is the primary advantage of an ndarray over a standard Python list?**

- A. It can store multiple data types (string, int, float) in one array.
- B. It is significantly faster and more memory-efficient for mathematical operations.
- C. It allows for easier text manipulation.
- D. It does not require a library import.

**Q19. If df.info() shows that a column has 10,000 non-null values but the total entries are 15,000, how many missing values are there?**

- A. 10,000
- B. 5,000
- C. 0
- D. 15,000

**Q20. What is the purpose of StandardScaler or MinMaxScaler?**

- A. To handle missing values in the dataset.
- B. To ensure all numerical features have a similar scale, preventing large numbers from dominating the model.
- C. To convert text data into numbers.
- D. To split the data into training and testing sets.

## Section 3: Exploratory Data Analysis (EDA) & Statistics

**Q21. A Scatter Plot shows points moving from top-left to bottom-right. This represents:**

- A. Positive Correlation
- B. Negative Correlation
- C. No Correlation
- D. Non-linear Relationship

**Q22. What does a Z-score of -2.5 signify?**

- A. The value is 2.5 times the mean.
- B. The value is 2.5 standard deviations below the mean.
- C. The value is at the 2.5th percentile.
- D. The value is an error in calculation.

**Q23. Which visualization is best for showing the distribution of a single continuous variable?**

- A. Bar Chart
- B. Scatter Plot
- C. Histogram
- D. Heatmap

**Q24. In a Boxplot, what do the "Whiskers" typically represent?**

- A. The Mean and Median.
- B. The range of the data, excluding outliers.
- C. The standard deviation.
- D. The interquartile range (IQR) only.

**Q25. You want to compare the mean salary of Male vs Female employees. Which statistical test is most appropriate?**

- A. ANOVA
- B. Chi-Square Test
- C. Two-sample t-test
- D. Pearson Correlation

**Q26. Which statistical measure is most affected by extreme outliers?**

- A. Median
- B. Mode
- C. Mean
- D. Interquartile Range

**Q27. What is "Bivariate Analysis"?**

- A. Analyzing the distribution of one variable.
- B. Analyzing the relationship between exactly two variables.
- C. Predicting multiple target variables at once.
- D. Cleaning data using two different methods.

**Q28. In an ANOVA test, if the p-value is 0.02 (at a 0.05 significance level), what is the conclusion?**

- A. There is no significant difference between group means.
- B. At least one group mean is significantly different from the others.
- C. All group means are identical.
- D. The data is not normally distributed.

**Q29. What is the "Interquartile Range" (IQR)?**

- A. The difference between the Max and Min values.
- B. The difference between the 75th percentile (Q3) and the 25th percentile (Q1).
- C. The average of the middle two quartiles.
- D. The square root of the variance.

**Q30. If two variables have a Pearson correlation coefficient of 0.0, it implies:**

- A. They are perfectly related.
- B. One variable causes the other.
- C. There is no linear relationship between them.
- D. One variable is constant.

## Section 4: Linear Regression

**Q31. In the equation $ŷ = w_1x + w_0$, what does $w_0$ represent?**

- A. The Slope
- B. The Bias (Intercept)
- C. The Feature Weight
- D. The Prediction Error

**Q32. The "Ordinary Least Squares" (OLS) method minimizes which of the following?**

- A. Mean Absolute Error (MAE)
- B. Sum of Squared Errors (SSE)
- C. Root Mean Squared Error (RMSE)
- D. Total number of outliers

**Q33. What is a major disadvantage of OLS compared to Gradient Descent?**

- A. It is less accurate.
- B. It does not provide an exact solution.
- C. It does not scale well to massive datasets with millions of features.
- D. It cannot be used for linear regression.

**Q34. In Linear Regression, what does $R^2$ (R-squared) measure?**

- A. The average error in the same units as the target.
- B. The percentage of variance in the target explained by the model.
- C. The probability that the slope is zero.
- D. The speed of the model's training.

**Q35. "Gradient Descent" is often compared to:**

- A. Climbing a mountain to find the peak.
- B. Walking down a hill to find the lowest valley (minimum error).
- C. Sorting a deck of cards.
- D. Connecting dots in a scatter plot.

**Q36. What happens if the "Learning Rate" in Gradient Descent is too high?**

- A. The model will take too long to train.
- B. The model might overshoot the minimum and fail to converge.
- C. The model will automatically overfit the data.
- D. The weights will become zero.

**Q37. A Mean Absolute Error (MAE) of 5,000 in a salary prediction model means:**

- A. The model is 95% accurate.
- B. On average, the predictions are $5,000 away from the actual salary.
- C. 5,000 employees were predicted correctly.
- D. The variance of the error is 5,000 squared.

**Q38. Which metric is most sensitive to large errors (outliers)?**

- A. MAE
- B. RMSE (Root Mean Squared Error)
- C. R-squared
- D. Median Absolute Error

**Q39. In statsmodels, what does the p-value for a coefficient indicate?**

- A. The accuracy of the prediction.
- B. Whether the relationship between that feature and the target is statistically significant.
- C. The weight of the feature.
- D. The number of iterations the model took.

**Q40. What is "Simple Linear Regression"?**

- A. Regression with only one target variable.
- B. Regression with only one predictor (independent) variable.
- C. Regression that does not use any weights.
- D. Regression used only for categorical data.

## Section 5: Decision Trees & Random Forests

**Q41. In a Decision Tree, the "Root Node" is:**

- A. The final prediction.
- B. The first split based on the most important feature.
- C. A node that cannot be split further.
- D. The node with the highest error.

**Q42. A "Gini Impurity" of 0.5 for a binary classification task indicates:**

- A. The node is perfectly pure (all one class).
- B. The node is perfectly impure (50/50 split).
- C. The model has overfitted.
- D. The feature is useless.

**Q43. Why do we "Prune" a decision tree?**

- A. To make it grow deeper.
- B. To reduce complexity and prevent overfitting.
- C. To increase the training time.
- D. To add more features to the split.

**Q44. What is "Information Gain"?**

- A. The amount of memory saved by the model.
- B. The reduction in entropy/impurity achieved by splitting on a feature.
- C. The number of new rows added to the dataset.
- D. The accuracy of the final leaf nodes.

**Q45. "Overfitting" in a Decision Tree typically looks like:**

- A. Low accuracy on both training and testing sets.
- B. High accuracy on the training set but low accuracy on the testing set.
- C. High accuracy on the testing set but low accuracy on the training set.
- D. A very shallow tree with only 2 nodes.

**Q46. What is a "Random Forest"?**

- A. A single tree trained on random data.
- B. An ensemble of multiple decision trees using bagging (bootstrap aggregating).
- C. A tree where the splits are chosen randomly without any math.
- D. A model used only for unsupervised clustering.

**Q47. In a Random Forest, how is the final prediction made for classification?**

- A. By averaging the depth of all trees.
- B. Through "Majority Voting" across all trees.
- C. By picking the first tree's prediction.
- D. By summing all the weights of the leaves.

**Q48. What is "Bootstrap Sampling"?**

- A. Deleting random rows from the data.
- B. Sampling data with replacement to create multiple unique training sets.
- C. Normalizing the data using a boot-like curve.
- D. Selecting only the top 10% of features.

**Q49. Which hyperparameter limits how deep a tree can grow?**

- A. min_samples_split
- B. max_depth
- C. criterion
- D. n_estimators

**Q50. Random Forests are generally better than single Decision Trees because:**

- A. They are faster to train.
- B. They are easier to visualize.
- C. They reduce variance and are less prone to overfitting.
- D. They require less data.

## Section 6: Neural Networks (Multilayer Perceptron)

**Q51. An Artificial Neuron (Perceptron) is mathematically inspired by:**

- A. A computer processor.
- B. A biological neuron (Dendrites, Soma, Axon).
- C. A chemical reaction.
- D. A social network.

**Q52. What is the role of an "Activation Function" (e.g., ReLU, Sigmoid)?**

- A. To initialize the weights to zero.
- B. To introduce non-linearity into the network.
- C. To count the number of layers.
- D. To store the data in memory.

**Q53. In a Neural Network, the "Hidden Layers" are located:**

- A. Before the input layer.
- B. Between the input and output layers.
- C. After the output layer.
- D. Only in the computer's GPU.

**Q54. What is "Backpropagation"?**

- A. Moving data from input to output to get a prediction.
- B. The process of calculating the error gradient and updating weights backward through the network.
- C. A method to delete irrelevant neurons.
- D. A way to visualize the training process.

**Q55. The "Learning Rate" in a Neural Network controls:**

- A. How many neurons are in each layer.
- B. How much the weights are adjusted during each step of Gradient Descent.
- C. The number of epochs the model runs.
- D. The size of the input data.

**Q56. What is an "Epoch"?**

- A. One single update of one weight.
- B. One full pass of the entire training dataset through the network.
- C. The time it takes for a model to finish training.
- D. A layer in the neural network.

**Q57. "Dropout" is a regularization technique used to:**

- A. Speed up the training process.
- B. Prevent overfitting by randomly "turning off" neurons during training.
- C. Add more layers to the model.
- D. Increase the accuracy of the training set.

**Q58. If you are predicting "Salary" (a continuous number) with a Neural Network, what should be the activation function of the final output layer?**

- A. Sigmoid
- B. Softmax
- C. Linear (or no activation)
- D. Tanh

**Q59. Which component represents the "strength" of the connection between two neurons?**

- A. Bias
- B. Weight
- C. Layer
- D. Tensor

**Q60. "Early Stopping" helps prevent overfitting by:**

- A. Stopping training when the validation error stops improving.
- B. Deleting the model if it takes too long.
- C. Reducing the number of features in the middle of training.
- D. Forcing the weights to become zero.

## Section 7: Machine Learning Concepts & Evaluation

**Q61. "Supervised Learning" requires:**

- A. Only input data (X).
- B. Both input data (X) and labeled output data (y).
- C. A human to watch the computer while it works.
- D. No data, only rules.

**Q62. Which of the following is a "Classification" problem?**

- A. Predicting the temperature for tomorrow.
- B. Predicting if a customer will "Churn" (Yes/No).
- C. Grouping users based on similar interests.
- D. Estimating the price of a used car.

**Q63. "Unsupervised Learning" is primarily used for:**

- A. Prediction.
- B. Clustering and finding hidden patterns in unlabeled data.
- C. Training robots to walk.
- D. Calculating the mean of a column.

**Q64. What is the "Bias-Variance Tradeoff"?**

- A. The balance between underfitting and overfitting.
- B. The cost of buying more data vs. buying more GPUs.
- C. The difference between mean and median.
- D. The speed of training vs. the speed of prediction.

**Q65. A model with "High Bias" is likely:**

- A. Overfitting.
- B. Underfitting (too simple to catch the pattern).
- C. Perfectly accurate.
- D. A Neural Network with 100 layers.

**Q66. In a 80/20 Train-Test split, the "Test Set" is used to:**

- A. Train the model.
- B. Evaluate how the model generalizes to new, unseen data.
- C. Tune the hyperparameters.
- D. Clean the data.

**Q67. What is "Cross-Validation"?**

- A. A way to check if the data is correct.
- B. A technique to evaluate model performance by splitting data into multiple "folds."
- C. Using two different models on the same data.
- D. Moving data from Excel to Python.

**Q68. Which of the following is a "Hyperparameter"?**

- A. The weights learned by a Neural Network.
- B. The max_depth of a Decision Tree.
- C. The predicted value of a house.
- D. The intercept of a linear regression.

**Q69. "Feature Engineering" refers to:**

- A. Writing code to fix bugs in the model.
- B. Creating new features or transforming existing ones to improve model performance.
- C. Buying more powerful computers.
- D. Scaling the output layer.

**Q70. The "Curse of Dimensionality" suggests that:**

- A. Having more features always makes the model better.
- B. As the number of features increases, the amount of data needed grows exponentially.
- C. 3D graphs are better than 2D graphs.
- D. High-dimensional data is easier to clean.

## Section 8: Tools, Environment & Workflow

**Q71. What is the primary purpose of GitHub in a data science project?**

- A. To run Python code in the cloud.
- B. For version control and collaboration on code.
- C. To store large CSV datasets for free.
- D. To create data visualizations.

**Q72. What does the command !git status do in a Colab notebook?**

- A. Shows the battery life of the server.
- B. Displays which files have been modified or staged in the repository.
- C. Tells you if your model has finished training.
- D. Connects your Drive to GitHub.

**Q73. In the terminal, cd library/numpy is used to:**

- A. Create a new folder.
- B. Change the current working directory to that folder.
- C. Delete the folder.
- D. Import the numpy library.

**Q74. What is a "README.md" file?**

- A. A file that contains the main Python script.
- B. A documentation file (Markdown) that explains the project to others.
- C. A hidden file used by the operating system.
- D. A database file.

**Q75. Kaggle is best known for:**

- A. Hosting data science competitions and providing datasets.
- B. Being a social media platform for developers.
- C. Providing cloud storage for photos.
- D. Managing local Git repositories.

**Q76. Which library is the standard for "Data Wrangling" and "Tabular Data" in Python?**

- A. Matplotlib
- B. Scikit-Learn
- C. Pandas
- D. TensorFlow

**Q77. Which library is primarily used for "Machine Learning" algorithms like Decision Trees and SVMs?**

- A. NumPy
- B. Seaborn
- C. Scikit-Learn
- D. Flask

**Q78. What does axis=1 usually refer to in Pandas operations?**

- A. Rows
- B. Columns
- C. Index
- D. The whole DataFrame

**Q79. How do you commit changes in Git?**

- A. git push
- B. git add . followed by git commit -m "message"
- C. git checkout
- D. git merge

**Q80. Google Colab is based on which environment?**

- A. VS Code
- B. Jupyter Notebooks
- C. Notepad++
- D. PyCharm

## Section 9: Advanced Analysis & Logic

**Q81. If a model has an $R^2$ of 1.0, it means:**

- A. The model is terrible.
- B. The model explains 100% of the variance (perfect fit, possibly overfitting).
- C. The model is 1% accurate.
- D. The model is biased.

**Q82. "Tidy Data" principles state that:**

- A. Each variable must have its own column.
- B. Each observation must have its own row.
- C. Each value must have its own cell.
- D. All of the above.

**Q83. A "Leading Question" in a survey is problematic because:**

- A. It is too long.
- B. It biases the respondent toward a specific answer.
- C. It cannot be analyzed with Python.
- D. It uses too many numbers.

**Q84. What is the difference between "Internal" and "External" data?**

- A. Internal data is from inside the organization; external is from outside.
- B. External data is always free.
- C. Internal data is always structured.
- D. There is no difference.

**Q85. "Metadata" is defined as:**

- A. Very large datasets.
- B. Data about data (e.g., date created, file size).
- C. Data stored in the cloud.
- D. Data that has been cleaned.

**Q86. In the "Data Exploration" step of EDA, "Univariate" means:**

- A. One galaxy.
- B. One variable.
- C. One model.
- D. One row.

**Q87. The "Central Limit Theorem" is important because it tells us:**

- A. All data is normal.
- B. The distribution of sample means will be normal if the sample size is large enough.
- C. The mean is always better than the median.
- D. Models will always converge.

**Q88. What is "Data Integration"?**

- A. Deleting redundant data.
- B. Combining data from multiple sources into a single view.
- C. Moving data from a laptop to a phone.
- D. Splitting one column into two.

**Q89. "Data Reduction" aims to:**

- A. Delete the whole dataset.
- B. Reduce the volume of data while producing the same analytical results.
- C. Hide the data from stakeholders.
- D. Convert all numbers to zero.

**Q90. A "Pie Chart" is generally discouraged in Data Science because:**

- A. It is too colorful.
- B. It is difficult for humans to accurately compare the sizes of angles/areas.
- C. It doesn't work with categorical data.
- D. It requires a GPU to render.

## Section 10: Final Synthesis

**Q91. Which activation function is most likely to be used in the hidden layers of a Deep Neural Network?**

- A. Sigmoid
- B. ReLU (Rectified Linear Unit)
- C. Softmax
- D. Linear

**Q92. In an "Inner Join" between two tables, the result includes:**

- A. All rows from both tables.
- B. Only rows where the join key exists in both tables.
- C. All rows from the left table only.
- D. Only rows that are missing in the second table.

**Q93. Which metric would you use to evaluate a model predicting "Survived" or "Died" on the Titanic?**

- A. RMSE
- B. Accuracy / F1-Score
- C. R-squared
- D. MAE

**Q94. The "Learning Curve" usually plots:**

- A. Height vs Weight.
- B. Training and Validation Error vs Number of Epochs.
- C. Accuracy vs Time of day.
- D. Salary vs Experience.

**Q95. "Hyperparameter Tuning" using GridSearchCV involves:**

- A. Randomly picking numbers.
- B. Testing a predefined set of hyperparameter combinations and choosing the best one.
- C. Asking the model to tune itself automatically.
- D. Searching for data on Google.

**Q96. In Python, range(0, 5) produces which numbers?**

- A. 0, 1, 2, 3, 4, 5
- B. 1, 2, 3, 4, 5
- C. 0, 1, 2, 3, 4
- D. 0, 5

**Q97. What is the main goal of "Asking the Right Question" in Data Science?**

- A. To make the code look better.
- B. To ensure the analysis provides actionable business value.
- C. To impress the boss with technical jargon.
- D. To make the dataset smaller.

**Q98. Which level of measurement allows for "Ratio" operations (multiplication/division)?**

- A. Eye Color (Blue, Brown)
- B. Temperature in Celsius
- C. Annual Income in USD
- D. Customer Satisfaction (Low, Med, High)

**Q99. The "Gini Impurity" formula is $1 - \sum p_i^2$. If a node has 100% "Yes", the Gini is:**

- A. 1.0
- B. 0.5
- C. 0.0
- D. 0.1

**Q100. The ultimate goal of Data Science is to:**

- A. Write the most complex code possible.
- B. Transform raw data into actionable insights and decisions.
- C. Collect as much data as possible.
- D. Replace all humans with AI.

## Answer Key (Quick Reference)

Q1. B
Q2. C
Q3. C
Q4. B
Q5. A
Q6. B
Q7. B
Q8. B
Q9. C
Q10. B
Q11. C
Q12. C
Q13. B
Q14. C
Q15. C
Q16. B
Q17. C
Q18. B
Q19. B
Q20. B
Q21. B
Q22. B
Q23. C
Q24. B
Q25. C
Q26. C
Q27. B
Q28. B
Q29. B
Q30. C
Q31. B
Q32. B
Q33. C
Q34. B
Q35. B
Q36. B
Q37. B
Q38. B
Q39. B
Q40. B
Q41. B
Q42. B
Q43. B
Q44. B
Q45. B
Q46. B
Q47. B
Q48. B
Q49. B
Q50. C
Q51. B
Q52. B
Q53. B
Q54. B
Q55. B
Q56. B
Q57. B
Q58. C
Q59. B
Q60. A
Q61. B
Q62. B
Q63. B
Q64. A
Q65. B
Q66. B
Q67. B
Q68. B
Q69. B
Q70. B
Q71. B
Q72. B
Q73. B
Q74. B
Q75. A
Q76. C
Q77. C
Q78. B
Q79. B
Q80. B
Q81. B
Q82. D
Q83. B
Q84. A
Q85. B
Q86. B
Q87. B
Q88. B
Q89. B
Q90. B
Q91. B
Q92. B
Q93. B
Q94. B
Q95. B
Q96. C
Q97. B
Q98. C
Q99. C
Q100. B

