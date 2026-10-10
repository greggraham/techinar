from sklearn.datasets import load_iris
from sklearn.linear_model import LogisticRegression
from sklearn.model_selection import train_test_split
from sklearn.pipeline import make_pipeline
from sklearn.preprocessing import StandardScaler

import techinar


def test_package_imports() -> None:
    assert callable(techinar.main)


def test_small_classifier_trains_and_scores() -> None:
    iris = load_iris()
    x_train, x_test, y_train, y_test = train_test_split(
        iris.data,
        iris.target,
        test_size=0.25,
        random_state=42,
        stratify=iris.target,
    )
    model = make_pipeline(StandardScaler(), LogisticRegression(max_iter=200))

    model.fit(x_train, y_train)

    assert model.score(x_test, y_test) >= 0.8
