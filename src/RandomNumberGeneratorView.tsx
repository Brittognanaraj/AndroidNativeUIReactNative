import React from 'react';
import {requireNativeComponent, ViewProps} from 'react-native';

interface NativeComponentProps {
    initialNumber:number;
}

export const RandomNumberGeneratorViewRaw = requireNativeComponent<NativeComponentProps>(
  'NativeNumberGeneratorView',
);

type RandomNumberGeneratorViewProps = ViewProps & NativeComponentProps;

export const RandomNumberGeneratorView: React.FC<
  RandomNumberGeneratorViewProps
> = (props) => {
  return <RandomNumberGeneratorViewRaw {...props} />;
};
