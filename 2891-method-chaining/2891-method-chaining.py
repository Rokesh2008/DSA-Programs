import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    df=animals[animals["weight"]>100]
    df=df.sort_values("weight" , ascending=False)
    return df[["name"]]